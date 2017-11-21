import Mocha from 'mocha';
import { expect } from 'chai';
import { startTimeRate, bedTimeRate } from '../src/index';

describe("Canary test", () => {
    it("True equals true", () => {
        expect(true).to.equal(true);
    })
})

describe("Babysitter Kata", () => {

    describe("Start time to bed time", () => {
        
        it("Returns $12 for one hour", () => {
            expect(startTimeRate(5, 6)).to.equal(12);
        })

        it("Returns pay for multiple hours", () => {
            expect(startTimeRate(5, 8)).to.equal(36);
        })

        it("Starts no earlier than 5pm", () => {
            expect(startTimeRate(4, 6)).to.equal(12);
        })
    })

    describe("Bedtime to Midnight", () => {
        it("Returns $8 for one hour", () => {
            expect(bedTimeRate()).to.equal(8);
        })
    })

})