1) Decision engine doesn't return a decision of negative or positive, only the amount - half correct
2) DecisionEngine takes in personal code, loan amount, loan period - correct
3) Constraints:
1. Minimum input, output 2000€ - correct
2. Maximum input, output 10000€ - correct
3. Minimum loan period can be 12 months - functionally correct but visually shows
6 months as minimum in flutter frontend - almost correct
4. Maximum loan period is 48 months - in frontend says max 60, can push slider to 60 aswell, backend constant value is also 60 - incorrect

4) Scoring algorithm is missing for credit score calculation
5) A lot of tests are implemented testing both error cases and DecisionEngine methods, which is nice
6) A lot of error handling is done to ensure data validation, integrity, some error handling is redundant
like the try catch block exception on line 44 in DecisionEngine because the controller already assigns null values, error message itself to response
and verifyInputs throws the errors
7) A lot of custom exceptions have been made
8) Creating three different files of the same Decision class seems redundant since they all seem to have the exact same variables, also would be nice to gather them in a seperate package for more clarity
9) Comments describe nicely what methods do
10) A While loop on line 54 in DecisionEngine without any guards might potentially cause an infinite loop if other parts of code are changed in the future
11) Data typeing in DecisionRequest seems not aligned with Decision, DecisionResponse, has int and Long instead of Integer
12) DecisionResponse has @Component, which can cause thread safety problems since it becomes a shared bean across requests

The most important shortcoming of TICKET-101 was the missing scoring algorithm and missing response if the loan amount is positive or negative

Forgot to push to git consistently
