let promise = new Promise((resolve, reject) => {
    let result = true;
    if (result) {
        resolve = ("Ok");
    } else {
        reject = ("Error");
    }
});

let test = document.querySelector('#date');

console.log("Opa");
console.log(test);
promise.then((data) => console.log(`Result: ${data}`));
promise.catch((data) => console.log(`Result2: ${data}`));