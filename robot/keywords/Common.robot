*** Settings ***
Documentation     Common keywords 
Library           calc.standard.Common

*** Keywords ***
StartTest
    [Arguments]    ${testName}
    [Documentation]     Start test for dbLog
    ...    @param testName
    jStartTest    ${testName}

Sleep
    [Arguments]    ${second}
    [Documentation]     Wait
    ...    @param second - number of secons
    jSleep    ${second}

RunCalculator
    [Documentation]     Run calculator method
    jRunCalculator

ActivateCalculator
    [Documentation]     Activate calculator method
    jActivateCalculator

MinimizeCalculator
    [Documentation]     Minimize calculator method
    ...    @throws TafException
    jMinimizeCalculator

CloseCalculator
    [Documentation]     Close calculator method
    ...    @throws TafException
    jCloseCalculator

SetTag
    [Arguments]    ${tag}
    [Documentation]     Method set tag for test
    ...    @param tag - a tag name
    jSetTag    ${tag}

