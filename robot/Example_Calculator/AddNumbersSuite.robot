*** Settings ***
Resource          ../keywords/AddNumbers.robot
Resource          ../keywords/Common.robot
Resource          ../keywords/Verify.robot

*** Test Cases ***
TC_Calculator_RF_1
    StartTest    "TC_Calculator_RF_1"
    SetTag    "Win7New"
    RunCalculator
    AddTwoIntNumbers    10    15
    VerifyResult    25
    CloseCalculator

TC_Calculator_RF_2
    StartTest    "TC_Calculator_RF_2"
    SetTag    "Win7New"
    RunCalculator
    AddTwoIntNumbers    2    567
    VerifyResult    569
    CloseCalculator

TC_Calculator_RF_3
    StartTest    "TC_Calculator_RF_3"
    SetTag    "Win7New"
    RunCalculator
    AddTwoIntNumbers    5    14
    VerifyResult    250
    CloseCalculator
