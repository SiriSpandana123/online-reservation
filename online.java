import java.util.Scanner;
class OnlineReservationSystem 
{
private static boolean[] seats = new boolean[5]; 
public static void main(String[] args) 
{
    Scanner scanner = new Scanner(System.in);
    while (true) 
    {
    System.out.println("Select the Number of your choice");
    System.out.println("1. Display available seats");
    System.out.println("2. Reserve the seat");
    System.out.println("3. Seat Cancellation");
    System.out.println("4. Exit");
    System.out.println("Enter your choice: ");
    int option = scanner.nextInt();
    switch (option) 
    {
    case 1:
        displayAvailableSeats();
        break;
    case 2:
        reserveTheSeat();
        break;
    case 3:
        seatCancellation();
        break;
    case 4:
        System.exit(0);
    default:
        System.out.println("option not found!");
    }
    }
}
private static void displayAvailableSeats() 
{
    System.out.println("\nAvailable Seats are :");
    for (int i = 0; i < seats.length; i++) 
    {
        if (seats[i]) 
        {
        System.out.print("A  "); 
        } 
        else 
        {
        System.out.print(i+1+"  "); 
        }
    }
    System.out.println();
}
private static void reserveTheSeat() 
{
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nChoose Number between 1 to 5 : ");
    int seatNumber = scanner.nextInt();
    if (seatNumber < 1 || seatNumber > 10) 
    {
        System.out.println("seat not found!");
    } 
    else if (seats[seatNumber - 1]) 
    {
        System.out.println("Seat is already taken!");
    } 
    else 
    {
    seats[seatNumber - 1] = true; 
    System.out.println("Seat is successfully reserved!");
    }
}
private static void seatCancellation() 
{
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nChoose the seat that is already reserved between 1 to 5 : ");
    int seatNumber = scanner.nextInt();
    if (seatNumber < 1 || seatNumber > 5) 
    {
        System.out.println("seat not found!");
    } 
    else if (!seats[seatNumber - 1]) 
    {
        System.out.println("Seat is  not reserved succesfully!");
    } 
    else 
    {
    seats[seatNumber - 1] = false; 
    System.out.println("Seat cancelled!");
    }
}
}
