import Mocha from 'mocha';
import { expect } from 'chai';
import { startTimeRate } from '../src/index';

describe("Canary test", () => {
    it("True equals true", () => {
        expect(true).to.equal(true);
    })
})

describe("Babysitter Kata", () => {

    describe("Start time to bed time", () => {
        
        it("Returns $12 for one hour", () => {
            expect(startTimeRate()).to.equal(12);
        })

        it("Returns $12 for multiple hours", () => {
            expect(startTimeRate()).to.equal(36);
        })
    })

})