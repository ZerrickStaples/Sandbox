export const startTimeRate = (startTime, bedTime) => {

    let hoursWorked = bedTime - startTime
    let startTimePay = hoursWorked * 12;

    return startTimePay;

}