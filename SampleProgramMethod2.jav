method checkGreater<<int a, int b>> 
{
	if<<a > b>> 
	{
		print:: a
	}
	else 
	{
		print:: b
	}
}

method main<< >>
{

boolean a = TRUE
boolean b = TRUE
if<<a== b>>
{
print::a
} 
else 
{
print::b
}
Methodcall checkGreater<<5,6>>

int p = 1
int len = 10
while<<p < len>>
{
print p
p++
}
int x = 5
int y = 10
int z = 7
int w = x + y *zc
print :: w
}