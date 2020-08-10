
set /p commitMessage=Enter Your Commit Message!!
echo %commitMessage%
make git m="%commitMessage%"
pause