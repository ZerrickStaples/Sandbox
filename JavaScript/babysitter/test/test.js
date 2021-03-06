import Mocha from 'mocha';
import { expect } from 'chai';
import { startTimeRate, bedTimeRate, endTimeRate } from '../src/index';

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
            expect(bedTimeRate(11, 12)).to.equal(8);
        })

        it("Returns pay for multiple hours", () => {
            expect(bedTimeRate(9, 12)).to.equal(24);
        })
    })

    describe("Midnight to end time", () => {

        it("Returns $16 for one hour", () => {
            expect(endTimeRate(12, 1)).to.equal(16);
        })

        it("Return pay for multiples hours", () => {
            expect(endTimeRate(12, 3)).to.equal(48);
        })

        it("Latest endTime is 4am", () => {
            expect(endTimeRate(12, 5)).to.equal(64);
        }) 
    })

})