export const startTimeRate = (startTime, bedTime) => {

    if(startTime < 5) {
        startTime = 5;
    }

    let hoursWorked = bedTime - startTime
    
    return hoursWorked * 12;

}

export const bedTimeRate = (bedTime, midnight) => {

    let hoursWorked = midnight - bedTime;

    return hoursWorked * 8;

}