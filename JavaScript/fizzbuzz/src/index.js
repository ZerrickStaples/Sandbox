export const fizzBuzz = (inputNumber) => {

    const isFizzBuzz = Boolean(inputNumber % 15 === 0)
    const isBuzz = Boolean(inputNumber % 5 === 0)
    const isFizz = Boolean(inputNumber % 3 === 0)

    if(isFizzBuzz) {
        return "FizzBuzz";
    }

    if(isBuzz) {
        return "Buzz";
    }

    if(isFizz) {
        return "Fizz";
    }
    
    return inputNumber;
}