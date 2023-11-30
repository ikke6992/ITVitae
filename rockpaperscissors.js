function shoot(rps) {
    const items = ["rock", "paper", "scissors"];
    var item = items[Math.floor(Math.random() * items.length)];
    if (item == rps) {
        document.getElementById("shoot").innerHTML = "Both picked " + rps + ", it's a TIE!";
    } else {
        for (var i = 0; i < items.length; i++) {
            if (rps == items[i]) {
                if (item == items[(i + 2) % items.length]) {
                    document.getElementById("shoot").innerHTML = rps + " beats " + item + ", YOU WIN!";
                } else {
                    document.getElementById("shoot").innerHTML = item + " beats " + rps + ", YOU LOSE!";
                }
            }
        }
    }
}