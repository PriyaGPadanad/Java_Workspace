class Runner {
    public static void main(String[] args) 
	{
int step=4;
int steps=5;
int length=10;
Ladder.stepUp(step);
Ladder.stepDown(steps);
Ladder.extend(length);   

boolean ToF=true;
boolean ToFs=false;
Ladder.fold(ToF);
Ladder.checkStability(ToFs);

String name="wodden";
int quality=10;
char surface='g';

Ladder.place(name,quality,surface);

int qun=8;
float amount=200.50f;
double width = 5.5;
Ladder.price(qun,amount,width);

}
}