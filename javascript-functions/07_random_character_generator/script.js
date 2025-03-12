  /**
 * DOCU: Random Character Generator
 * This program creates randomized RPG characters with properties such as name, class, health, and special abilities.
 * It can generate multiple characters and simulate battles between two characters.
 * The health of characters is randomized, and special abilities are assigned randomly.
 * The battle method calculates damage and updates health points accordingly, preventing negative health values.
 */

function generateCharacter(name) {
  const names = ["Thorin", "Elara", "Zane", "Ivy", "Dante"]; // Predefined names
  const classes = ["Warrior", "Mage", "Archer", "Healer", "Assassin"]; // Predefined classes
  const abilities = ["Fireball", "Healing Touch", "Stealth", "Lightning Strike", "Power Slash"]; // Predefined special abilities

  // Create the character object with random or provided name
  const character = {
    name: name || names[Math.floor(Math.random() * names.length)], // Assign provided name or random name
    class: classes[Math.floor(Math.random() * classes.length)], // Randomly assign class
    health: Math.floor(Math.random() * (150 - 50 + 1)) + 50, // Random health between 50 and 150
    specialAbility: abilities[Math.floor(Math.random() * abilities.length)], // Randomly assign special ability

    /**
     * DOCU: Randomize health between 50 and 150
     * Used to regenerate the character's health
     */
    randomizeHealth: function () {
      this.health = Math.floor(Math.random() * (150 - 50 + 1)) + 50;
    },

    /**
     * DOCU: Simulates a battle between two characters
     * Attacks the other character, deals random damage between 5 and 20
     * Logs the attack result and updates health points
     * @param {object} otherCharacter - The opponent character object
     */
    battle: function (otherCharacter) {
      const damage = Math.floor(Math.random() * (20 - 5 + 1)) + 5; // Random damage between 5 and 20
      const previousHealth = otherCharacter.health;
      otherCharacter.health -= damage;

      // Prevent health from dropping below zero
      if (otherCharacter.health < 0) {
        otherCharacter.health = 0;
      }

      console.log(`${this.name} attacked ${otherCharacter.name} with ${this.specialAbility}. ${otherCharacter.name}'s health dropped from ${previousHealth} to ${otherCharacter.health}.`);
      console.log(`${otherCharacter.name} attacked ${this.name} with ${otherCharacter.specialAbility}. ${this.name}'s health dropped from ${previousHealth} to ${this.health}.`);
    }
  };

  return character;
}

/**
 * DOCU: Generates multiple characters
 * @param {number} x - Number of characters to generate
 * @returns {array} Array of character objects
 */
function generateMultipleCharacters(x) {
  const characters = [];
  for (let i = 0; i < x; i++) {
    characters.push(generateCharacter());
  }
  return characters;
}

// Example Usage
const character1 = generateCharacter("Zane"); // Create a character with a custom name
const character2 = generateCharacter("Elara"); // Create a character with a custom name

console.dir(character1); // Display Character 1 details
console.dir(character2); // Display Character 2 details

character1.battle(character2); // Simulate a battle between Character 1 and Character 2

const party = generateMultipleCharacters(5); // Generate 5 random characters

// Loop through each character and log their details
party.forEach((hero, index) => {
  console.log(`Hero ${index + 1}:`);
  console.log(`Name: ${hero.name}`);
  console.log(`Class: ${hero.class}`);
  console.log(`Health: ${hero.health}`);
  console.log(`Special Ability: ${hero.specialAbility}`);
  console.log('--------------------------');
});
