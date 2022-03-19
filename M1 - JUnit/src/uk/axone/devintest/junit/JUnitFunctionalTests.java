package uk.axone.devintest.junit;

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class JUnitFunctionalTests {

    /*
    Login
    Book a Ticket
    Check-IN
    Cancel Ticket
    Logout
     */

    //run only once at the beginning of the class (before any tests are run)
    @BeforeClass
    public static void loadTestData(){
        //clear old test data
        //setup new test data for current run
        System.out.println("Initialising test data .. ");
    }

    //run before every test
    @Before
    public void login(){
        //launch your browser
        //enter the URL
        //enter username, password - click on login
        System.out.println("Logging into the application");
    }

    @Test
    public void A_bookTicket(){
        System.out.println("Booking a ticket");
    }

    @Test
    public void B_checkIN(){
        System.out.println("Checking In....");
    }

    @Test
    public void C_cancelTicket(){
        System.out.println("Cancelling the ticket");
    }

    //run after every test
    @After
    public void logout(){
        //click on logout button
        //close the browser
        System.out.println("Logging out of the application");
    }

    //run only once at the end of the class (after all tests are run)
    @AfterClass
    public static void tearDown(){
        //close connections
        System.out.println("Completed running all tests!");
    }

}
