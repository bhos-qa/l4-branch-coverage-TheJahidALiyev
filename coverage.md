# What is Code Coverage?
Code coverage is a white-box testing technique performed to verify the extent to which the code has been executed. Code coverage tools use static instrumentation in which statements monitoring code execution are inserted at critical junctures in the code. There are different kinds of coverage techniques used to measure that and I will mention some of them.

## Statement Coverage
In this, the code is created in a way that every executable statement in the source code is executed at least once. This includes corner cases or boundary cases to determine how many statements have been executed. 

## Branch Coverage
This is used to ensure that every branch in a decision-making process is executed. Let’s say a tester is including a statement using an If…Else conditional statement or a Do…While statement in the code. Branch coverage will ensure that all branches (If, Else, Do, While) are tested with appropriate input.

## Conditional (Predicate) Coverage
This reveals how variables in the conditional statements are evaluated. It helps to provide proper coverage to the control flow by determining how many of the boolean sub-expressions have been tested for a true and a false value.