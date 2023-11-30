function compliment0(item) {
    console.log(`What a nice ${item}`);
}

const compliment1 = function(item) {
    console.log(`What a nice ${item}`);
}

const compliment2 = item => console.log(`What a nice ${item}`);

const lang = ["Nederlands", "English", "Java"];

const obj = {number: 1, name: "Thomas", languages: lang};

const lang2 = [...lang];
lang2.push("JavaScript");

const obj2 = {...obj, languages: lang2};