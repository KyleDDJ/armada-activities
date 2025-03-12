//Battle of Mactan or Battle of the Warriors?
// Object representing Lapulapu with properties: name, hp, strength, and attack function
let lapulapu = {
    name: 'Lapulapu', //Name of the character
    hp: 100, //Health points 
    strength: 25, //Max damage the character that can deal
    attack: function () {
        return Math.floor(Math.random() * (this.strength + 1));
    }
};

let magellan = {
    name: 'Magellan',
    hp: 100,
    strength: 24,
    attack: function () {
        return Math.floor(Math.random() * (this.strength + 1));
    }
};

console.log("xXx Battle Begins!⚔️ xXx\n"); //Display the start of the battle

// Function to perform an attack between two characters 
function battle(attacker, defender) {
    let damage = attacker.attack(); //Get the damage from attacker
    defender.hp -= damage; //Subtract it from the defender health points

    //Prevents the negative health points from defender when defeated early
    if (defender.hp < 0) { 
        defender.hp = 0;
    }

    console.log(attacker.name + " attacks " + defender.name + " and does " + damage + " damage!");
    console.log(attacker.name + " HP: " + attacker.hp + " | " + defender.name + " HP: " + defender.hp);
}

for (let round = 1; round <= 10; round++) {
    console.log(`=== Round ${round} ⚔️ ===`); //Display the current round
    battle(lapulapu, magellan);
    if (magellan.hp <= 0) {
        console.log(magellan.name + " has been defeated! The battle ends early.\n"); //when the defenders hp reaches 0 before round 10.
        break;  // Stop the battle immediately
    }

    battle(magellan, lapulapu);
    if (lapulapu.hp <= 0) {
        console.log(lapulapu.name + " has been defeated! The battle ends early.\n");
        break;
    }

    console.log("\n"); //new line for better readability
}

if (lapulapu.hp > magellan.hp) {
    console.log(`🏆 ${lapulapu.name} WINS the battle! 🏆`);
} else if (magellan.hp > lapulapu.hp) {
    console.log(`🏆 ${magellan.name} WINS the battle! 🏆`);
} else {
    console.log("⚔️It's a DRAW!⚔️");
}