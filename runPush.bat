
echo "Enter message"  

set /p UserInputPath=What Directory would you like?
echo %UserInputPath%
make git m="%UserInputPath%"
pause