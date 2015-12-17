*** Settings ***
Resource          ../keywords/AddNumbers.robot
Resource          ../keywords/Common.robot
Resource          ../keywords/Verify.robot

*** Test Cases ***
AddNumbersTestCase
    SetConfiguration
    SetTag    "Win7New"
    RunCalculator
    AddTwoIntNumbers    10    15
    VerifyResult    "25"
    ${res}    AddTwoDoubleNumbers    2.6    11.7
    log    "Result: " + ${res}
    VerifyResult    "14.3"
    ClickSequence    23.4+45-102*2/0.13=
    VerifyResult    "-516.9230769230769"
    CloseCalculator
