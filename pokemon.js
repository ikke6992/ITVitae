//https://pokeapi.co/api/v2/pokemon/
//https://pokeapi.co/api/v2/pokemon/pikachu

function getNames(array) {
    let result = [];
    for (item of array) {
        result.push(item.ability.name);
    }
    
    return result;
}

function getPokemon(pokemon) {
    fetch(`https://pokeapi.co/api/v2/pokemon/${pokemon}`)
        .then(response => response.json())
        .then(data => {
            console.table({"name": pokemon, "height": data.height, "weight": data.weight, "abilities": getNames(data.abilities)});
        })
}

getPokemon("snorlax");
