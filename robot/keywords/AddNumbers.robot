*** Settings ***
Documentation     Method for adding numbers porpose 
Library           calc.standard.AddNumbers

*** Keywords ***
AddTwoIntNumbers
    [Arguments]    ${x}    ${y}
    [Documentation]     Method for adding two int numbers
    ...    @param x - first number
    ...    @param y - second number
    ...    @return - expected result
    ...    @throws TafException
    ${result}    jAddTwoIntNumbers    ${x}    ${y}
    [Return]    ${result}

AddTwoDoubleNumbers
    [Arguments]    ${x}    ${y}
    [Documentation]     Method for adding two doble numbers
    ...    @param x - first double number
    ...    @param y - second double number
    ...    @return - double type result
    ...    @throws TafException
    ${result}    jAddTwoDoubleNumbers    ${x}    ${y}
    [Return]    ${result}

ClickSequence
    [Arguments]    ${sequence}
    [Documentation]     Method for adding complicated sequence of numbers
    ...    @param sequence - sequence of numbers eg. 10,5 + 200 + 101,034
    ...    @return
    ...    @throws TafException
    jClickSequence    ${sequence}

