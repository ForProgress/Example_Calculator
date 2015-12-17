*** Settings ***
Documentation     Methods for verifying calculation result 
Library           calc.standard.Verify

*** Keywords ***
VerifyResult
    [Arguments]    ${expectedResult}
    [Documentation]     Method for verifying calkulation result
    ...    @param expectedResult - expected result
    ...    @return - boolean type. true - passed, false - failed
    ${result}    jVerifyResult    ${expectedResult}
    [Return]    ${result}

