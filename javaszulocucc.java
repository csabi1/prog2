class Mother
{
	public final void ir()
	{
		System.out.print("Function of the mother!");
	}
};

class ancesster extends Mother
{
	public final void masikir()
	{
		System.out.print("Function of the ancesster");
	}
};
public class GlobalMembers
{
	public static void main(String [ ] args)
	{
	 Mother b = new Mother();
	 b.ir();
	// b.masikir();

	ancesster c = new ancesster();
	c.ir();
	
	}

}