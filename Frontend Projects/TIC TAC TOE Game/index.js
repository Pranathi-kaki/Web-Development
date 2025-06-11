let player = 1;

function update(obj) {
  let val = obj.innerHTML;
  //only if the block is empty then we can put X or O in it else we can't fro which we use the below if loop
  if (val == '') {
    if (player == 1) {
      obj.innerHTML = 'X'
      check(obj)
      player = 2;
    }
    else {
      obj.innerHTML = 'O'
      check(obj)
      player = 1;
    }
  }
  // const obj_1 = document.getElementById("btn_1");
  // obj.innerHTML='X'
  console.log("UPDATE function is active")
}
function check(obj) {
  console.log("CHECK function is active");
  const obj1 = document.getElementById("btn_1");
  const obj2 = document.getElementById("btn_2");
  const obj3 = document.getElementById("btn_3");
  const obj4 = document.getElementById("btn_4");
  const obj5 = document.getElementById("btn_5");
  const obj6 = document.getElementById("btn_6");
  const obj7 = document.getElementById("btn_7");
  const obj8 = document.getElementById("btn_8");
  const obj9 = document.getElementById("btn_9");
  const res = document.getElementsByClassName("result")[0];

  let key = obj.innerHTML;
  let val_1 = obj1.innerHTML;
  let val_2 = obj2.innerHTML;
  let val_3 = obj3.innerHTML;
  let val_4 = obj4.innerHTML;
  let val_5 = obj5.innerHTML;
  let val_6 = obj6.innerHTML;
  let val_7 = obj7.innerHTML;
  let val_8 = obj8.innerHTML;
  let val_9 = obj9.innerHTML;

  if ((obj === obj1) && ((key == val_2 && key == val_3) || (key == val_4 && key == val_7) || (key == val_5 && key == val_9))) {
    console.log(key + ' wins');
    res.innerHTML= key + ' wins'; 
  }
  else if ((obj === obj2) && ((key == val_1 && key == val_3) || (key === val_5 && key == val_8))) {
    console.log(key + ' wins')
    res.innerHTML= key + ' wins'; 
  }
  else if ((obj === obj3) && ((key == val_1 && key == val_2) || (key == val_6 && key == val_9) || (key == val_5 && key == val_7))) {
    console.log(key + ' wins')
    res.innerHTML= key + ' wins'; 
  }
  else if ((obj === obj4) && ((key == val_1 && key == val_7) || (key == val_5 && key == val_6))) {
    console.log(key + ' wins');
    res.innerHTML= key + ' wins'; 
  }
  else if ((obj === obj5) && ((key == val_1 && key == val_9) || (key == val_2 && key == val_8) || (key == val_3 && key == val_7) || (key == val_4 && key == val_6))) {
    console.log(key + ' wins');
    res.innerHTML= key + ' wins'; 
  }
  else if ((obj === obj6) && ((key == val_3 && key == val_9) || (key == val_4 && key == val_5))) {
    console.log(key + ' wins');
    res.innerHTML= key + ' wins'; 
  }
  else if ((obj === obj7) && ((key == val_1 && key == val_4) || (key == val_8 && key == val_9) || (key == val_5 && key == val_3))) {
    console.log(key + ' wins');
    res.innerHTML= key + ' wins'; 
  }
  else if ((obj === obj8) && ((key == val_2 && key == val_5) || (key == val_7 && key == val_9))) {
    console.log(key + ' wins');
    res.innerHTML= key + ' wins'; 
  }
  else if ((obj === obj9) && ((key == val_3 && key == val_6) || (key == val_1 && key == val_5) || (key == val_7 && key == val_8))) {
    console.log(key + ' wins');
    res.innerHTML= key + ' wins'; 
  }
}
function resetGame() {
  // Reset all buttons
  for (let i = 1; i <= 9; i++) {
    document.getElementById(`btn_${i}`).innerHTML = '';
  }

  // Reset result text
  document.getElementsByClassName("result")[0].innerHTML = '';

  // Reset to player 1
  player = 1;
}

