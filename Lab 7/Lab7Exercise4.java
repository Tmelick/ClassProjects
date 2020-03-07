/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        7
Exercise:   4
ProgramName:Lab7Exercise4
Purpose:    To print out the number of letters used and how many times they
            were used
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   A string
Output(s):  The amount of times the letters were used and which letters.
Methodology:Declare variables, let computer do the math
References: Internet
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class Lab7Exercise4
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);

String s1;
int length;
int i;


int aCount;
int bCount;
int cCount;
int dCount;
int eCount;
int fCount;
int gCount;
int hCount;
int iCount;
int jCount;
int kCount;
int lCount;
int mCount;
int nCount;
int oCount;
int pCount;
int qCount;
int rCount;
int sCount;
int tCount;
int uCount;
int vCount;
int wCount;
int xCount;
int yCount;
int zCount;

System.out.print("Please enter a string: ");
s1 = input.nextLine();
length = s1.length();
i = 0;

aCount = 0;
bCount = 0;
cCount = 0;
dCount = 0;
eCount = 0;
fCount = 0;
gCount = 0;
hCount = 0;
iCount = 0;
jCount = 0;
kCount = 0;
lCount = 0;
mCount = 0;
nCount = 0;
oCount = 0;
pCount = 0;
qCount = 0;
rCount = 0;
sCount = 0;
tCount = 0;
uCount = 0;
vCount = 0;
wCount = 0;
xCount = 0;
yCount = 0;
zCount = 0;


while( length > i  ){
if (s1.charAt(i) == 'a' || s1.charAt(i) == 'A' )
aCount += 1;
else if (s1.charAt(i) == 'b' || s1.charAt(i) == 'B' )
bCount += 1;
else if (s1.charAt(i) == 'c' || s1.charAt(i) == 'C' )
cCount += 1;
else if (s1.charAt(i) == 'd' || s1.charAt(i) == 'D' )
dCount += 1;
else if (s1.charAt(i) == 'e' || s1.charAt(i) == 'E' )
eCount += 1;
else if (s1.charAt(i) == 'f' || s1.charAt(i) == 'F' )
fCount += 1;
else if (s1.charAt(i) == 'g' || s1.charAt(i) == 'G' )
gCount += 1;
else if (s1.charAt(i) == 'h' || s1.charAt(i) == 'H' )
hCount += 1;
else if (s1.charAt(i) == 'i' || s1.charAt(i) =='I' )
iCount += 1;
else if (s1.charAt(i) == 'j' || s1.charAt(i) =='J' )
jCount += 1;
else if (s1.charAt(i) == 'k' || s1.charAt(i) == 'k' )
kCount += 1;
else if (s1.charAt(i) == 'l' || s1.charAt(i) == 'L' )
lCount += 1;
else if (s1.charAt(i) == 'm' || s1.charAt(i) == 'M' )
mCount += 1;
else if (s1.charAt(i) == 'n' || s1.charAt(i) == 'N' )
nCount += 1;
else if (s1.charAt(i) == 'o' || s1.charAt(i) == 'O' )
oCount += 1;
else if (s1.charAt(i) == 'p' || s1.charAt(i) == 'P' )
pCount += 1;
else if (s1.charAt(i) == 'q' || s1.charAt(i) == 'Q' )
qCount += 1; 
else if (s1.charAt(i) == 'r' || s1.charAt(i) == 'R' )
rCount += 1;
else if (s1.charAt(i) == 's' || s1.charAt(i) == 'S' )
sCount += 1;
else if (s1.charAt(i) == 't' || s1.charAt(i) == 'T' )
tCount += 1;
else if (s1.charAt(i) == 'u' || s1.charAt(i) == 'U' )
uCount += 1;
else if (s1.charAt(i) == 'v' || s1.charAt(i) == 'V' )
vCount += 1;
else if (s1.charAt(i) == 'w' || s1.charAt(i) == 'W' )
wCount += 1;
else if (s1.charAt(i) == 'x' || s1.charAt(i) =='X' )
xCount += 1;
else if (s1.charAt(i) == 'y' || s1.charAt(i) =='Y' )
yCount += 1;
else if (s1.charAt(i) == 'z' || s1.charAt(i) =='Z' )
zCount += 1;

i++;
}
if (aCount > 0)
System.out.println("Letter A: " + aCount);
if (bCount > 0)
System.out.println("Letter B: " + bCount);
if (cCount > 0)
System.out.println("Letter C: " + cCount);
if (dCount > 0)
System.out.println("Letter D: " + dCount);
if (eCount > 0)
System.out.println("Letter E: " + eCount);
if (fCount > 0)
System.out.println("Letter F: " + fCount);
if (gCount > 0)
System.out.println("Letter G: " + gCount);
if (hCount > 0)
System.out.println("Letter H: " + hCount);
if (iCount > 0)
System.out.println("Letter I: " + iCount);
if (jCount > 0)
System.out.println("Letter J: " + jCount);
if (kCount > 0)
System.out.println("Letter K: " + kCount);
if (lCount > 0)
System.out.println("Letter L: " + lCount);
if (mCount > 0)
System.out.println("Letter M: " + mCount);
if (nCount > 0)
System.out.println("Letter N: " + nCount);
if (oCount > 0)
System.out.println("Letter O: " + oCount);
if (pCount > 0)
System.out.println("Letter P: " + pCount);
if (qCount > 0)
System.out.println("Letter Q: " + qCount);
if (rCount > 0)
System.out.println("Letter R: " + rCount);
if (sCount > 0)
System.out.println("Letter S: " + sCount);
if (tCount > 0)
System.out.println("Letter T: " + tCount);
if (uCount > 0)
System.out.println("Letter U: " + uCount);
if (vCount > 0)
System.out.println("Letter V: " + vCount);
if (wCount > 0)
System.out.println("Letter W: " + wCount);
if (xCount > 0)
System.out.println("Letter X: " + xCount);
if (yCount > 0)
System.out.println("Letter Y: " + yCount);
if (zCount > 0)
System.out.println("Letter Z: " + zCount);

}
}