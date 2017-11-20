import Mocha from 'mocha';
import { expect } from 'chai';
import { fizzBuzz } from '../src/index';

describe("Canary test", () => {
    it("True equals true", () => {
        expect(true).to.equal(true);
    })
})

describe("FizzBuzz", () => {

    describe("FizzBuzz returns a number", () => {
        
        it("Returns input", () => {
            expect(fizzBuzz(1)).to.equal(1);
        })

        it("Returns more input", () => {
            expect(fizzBuzz(2)).to.equal(2);
        })
    })

    describe("FizzBuzz returns Fizz", () => {

        it("Returns Fizz when 3 is inputNumber", () => {
            expect(fizzBuzz(3)).to.equal("Fizz");
        })

        it("returns Fizz on multiples of 3", () => {
            expect(fizzBuzz(9)).to.equal("Fizz");
        })
    })

    describe("FizzBuzz returns Buzz", () => {
        
        it("Returns Buzz when 5 is inputNumber", () => {
            expect(fizzBuzz(5)).to.equal("Buzz");
        })

        it("Returns Buzz on multiples of 5", () => {
            expect(fizzBuzz(10)).to.equal("Buzz");
        })
    })

})