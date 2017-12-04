import Mocha from 'mocha';
import { expect } from 'chai';
import { write } from '../src/index';

describe("Canary test", () => {
    it("True equals true", () => {
        expect(true).to.equal(true);
    })
})

describe("Pencil durability", () => {

    describe("Write function", () => {
        it("Write returns text", () => {
            expect(write()).to.equal("She sells sea shells");
        })
        it("Write appends text", () => {
            expect(write()).to.equal("She sells sea shells down by the sea shore");
        })
    })

})