method factorial<<int n>>
{
if <<n == 1>>
{
return 
}
else
{
int y
y = n
n--
int result = y * factorial<<n>>
return result
}
}