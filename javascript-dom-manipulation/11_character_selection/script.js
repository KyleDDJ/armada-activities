// Tekken 8 character data
const characters = [
    {
        id: 1,
        name: "Jin Kazama",
        image: "tekken-8/jin-kazama.webp",
        description: "Seeking to rid himself of the Devil Gene, Jin enters the tournament to end the Mishima bloodline once and for all.",
        stats: {
            power: 80,
            speed: 70,  
            reach: 65
        }
    },
    {
        id: 2,
        name: "Kazuya Mishima",
        image: "tekken-8/Kazuya-Mishima.webp",
        description: "Having fully embraced his Devil powers, Kazuya now seeks to eliminate anyone who stands in his way of total domination.",
        stats: {
            power: 90,
            speed: 60,
            reach: 70
        }
    },
    {
        id: 3,
        name: "Nina Williams",
        image: "tekken-8/Nina-Williams.webp",
        description: "The cold-blooded assassin returns, bringing her deadly Close Quarters Combat style to the tournament.",
        stats: {
            power: 60,
            speed: 85,
            reach: 65
        }
    },
    {
        id: 4,
        name: "King",
        image: "tekken-8/King.webp",
        description: "The masked wrestler continues his legacy of helping orphans by competing in the latest King of Iron Fist Tournament.",
        stats: {
            power: 85,
            speed: 60,
            reach: 75
        }
    },
    {
        id: 5,
        name: "Hwoarang",
        image: "tekken-8/Hwoarang.webp",
        description: "The Taekwondo master returns seeking to finally defeat his rival Jin Kazama.",
        stats: {
            power: 70,
            speed: 85,
            reach: 80
        }
    },
    {
        id: 6,
        name: "Xiaoyu",
        image: "tekken-8/Ling-Xiaoyu.webp",
        description: "Still hoping to save Jin from his dark fate, Xiaoyu enters the tournament with renewed determination.",
        stats: {
            power: 55,
            speed: 90,
            reach: 60
        }
    },
    {
        id: 7,
        name: "Paul Phoenix",
        image: "tekken-8/Paul-Phoenix.webp",
        description: "The hot-blooded fighter returns, still aiming to prove he's the toughest in the universe.",
        stats: {
            power: 95,
            speed: 65,
            reach: 70
        }
    },
    {
        id: 8,
        name: "Marshall Law",
        image: "tekken-8/marshall-law.png",
        description: "The martial arts master with lightning-fast attacks returns to the tournament to earn money for his family.",
        stats: {
            power: 75,
            speed: 85,
            reach: 65
        }
    },
    {
        id: 9,
        name: "Jack-8",
        image: "tekken-8/jack-8.png",
        description: "The newest model in the Jack series, equipped with advanced combat capabilities and programming.",
        stats: {
            power: 100,
            speed: 45,
            reach: 90
        }
    }
];

// DOM elements
const characterGrid = document.querySelector('.character-grid');
const selectedCharacterImage = document.getElementById('selectedCharacterImage');
const selectedCharacterName = document.getElementById('selectedCharacterName');
const selectedCharacterDescription = document.getElementById('selectedCharacterDescription');
const powerStat = document.getElementById('powerStat');
const speedStat = document.getElementById('speedStat');
const reachStat = document.getElementById('reachStat');

// Initialize character grid
function initCharacterGrid() {
    characters.forEach(character => {
        // Create character item
        const characterItem = document.createElement('div');
        characterItem.className = 'character-item';
        
        // Store character data as data attributes
        characterItem.dataset.id = character.id;
        characterItem.dataset.name = character.name;
        characterItem.dataset.description = character.description;
        characterItem.dataset.power = character.stats.power;
        characterItem.dataset.speed = character.stats.speed;
        characterItem.dataset.reach = character.stats.reach;
        
        // Create character icon container
        const characterIcon = document.createElement('div');
        characterIcon.className = 'character-image';
        
        // Since we don't have actual images, use placeholder for demonstration
        // characterIcon.style.backgroundImage = `url('https://via.placeholder.com/70x70?text=${character.name.split(' ')[0]}')`;
        characterIcon.style.backgroundImage = `url('${character.image}')`;

        // Add character name
        const characterName = document.createElement('div');
        characterName.className = 'character-name-small';
        characterName.textContent = character.name;
        
        // Add to character item
        characterItem.appendChild(characterIcon);
        characterItem.appendChild(characterName);
        
        // Add click event listener
        characterItem.addEventListener('click', () => selectCharacter(character));
        
        // Add to grid
        characterGrid.appendChild(characterItem);
    });
}

// Select a character
function selectCharacter(character) {
    // Play selection sound effect
    playSelectSound();
    
    // Remove selected class from all characters
    document.querySelectorAll('.character-item').forEach(item => {
        item.classList.remove('selected');
    });
    
    // Add selected class to clicked character
    const selectedItem = document.querySelector(`.character-item[data-id="${character.id}"]`);
    if (selectedItem) {
        selectedItem.classList.add('selected');
    }
    
    // Update the selected character display
    // selectedCharacterImage.style.backgroundImage = `url('https://via.placeholder.com/200x280?text=${character.name}')`;
    selectedCharacterImage.style.backgroundImage = `url('${character.image}')`;

    selectedCharacterName.textContent = character.name;
    selectedCharacterDescription.textContent = character.description;
    
    // Update stats with animation
    updateStats(character.stats);
}

// Update character stats with animation
function updateStats(stats) {
    // Animate the stat bars
    powerStat.style.width = `${stats.power}%`;
    speedStat.style.width = `${stats.speed}%`;
    reachStat.style.width = `${stats.reach}%`;
}

// Play selection sound
function playSelectSound() {
    // Create an audio element for the selection sound
    const audio = new Audio();
    audio.src = 'select-sound.mp3'; // You would need to have this file
    
    // We'll just log instead of playing since we don't have the actual sound file
    console.log('Character selection sound played');
    
    // If you had the sound file:
    // audio.play().catch(e => console.log('Audio play failed:', e));
}

// Initialize the application when the DOM is loaded
document.addEventListener('DOMContentLoaded', () => {
    initCharacterGrid();
    
    // Auto-select the first character
    if (characters.length > 0) {
        setTimeout(() => {
            selectCharacter(characters[0]);
        }, 500); // Small delay for initial loading effect
    }
});