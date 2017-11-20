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
            expect(fizzBuzz()).to.equal(1);
        })

        it("Returns more input", () => {
            expect(fizzBuzz(2)).to.equal(2);
        })

    })

})