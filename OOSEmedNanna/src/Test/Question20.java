package Test;
public
class
 Question20 {
static
class
 JumpException 
extends
 Exception {
private
static
final
long
serialVersionUID
 = 1L;
public
 String getMessage() { 
return
"Vandalisme thrown!"
; 
}
}
private
static
void
 countDown() 
throws
 JumpException {
for
(
int
 i = 5; 
true
; i
--
) {
if
 (i > 0)
System.
out
.println(i);
else
throw
new
 JumpException();
}
}
public
static
void
 main(String[] args) {
try
 {
try
 {
countDown
();
} 
catch
(JumpException e) {
System.
out
.println(e.getMessage());
countDown
();
}
} 
catch
(JumpException e) {
System.
out
.println(e.getMessage());
}
}public String toString(){
	return "Centre is";}
}