class Main {
	public static void main(String[] args) {

		Team a1 = new Team("The Incredibles");
		Team a2 = new Team("Iron Men");
		Team a3 = new Team("The Bad");
		Team a4 = new Team("The Good");
		Team a5 = new Team("The Evil");
		Team a6 = new Team("The Weird");

		a1.setRank(10);
		a2.setRank(9);
		a3.setRank(8);
		a4.setRank(7);
		a5.setRank(6);
		a6.setRank(5);

		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(a4.toString());
		System.out.println(a5.toString());
		System.out.println(a6.toString());

	}
}