// Date class
class Date {
    private final int day;
    private final String month;
    private final int year;

    public Date(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isBefore(Date d1) {
        return this.year < d1.year ||
                (this.year == d1.year && (getMonthValue(this.month) < getMonthValue(d1.month)
                        || (getMonthValue(this.month) == getMonthValue(d1.month)
                        && this.day < d1.day)));
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    private int getMonthValue(String Mmm) {
        return switch (Mmm) {
            case "Jan" -> 1;
            case "Feb" -> 2;
            case "Mar" -> 3;
            case "Apr" -> 4;
            case "May" -> 5;
            case "Jun" -> 6;
            case "Jul" -> 7;
            case "Aug" -> 8;
            case "Sep" -> 9;
            case "Oct" -> 10;
            case "Nov" -> 11;
            case "Dec" -> 12;
            default -> -1; // Invalid month
        };
    }
}

// Member class
class Member {
    private final int memberId;
    private final String lastName;
    private final  String firstName;
    private int handicap;
    private final char gender;
    private String team = "N/A";;
    private final String memberType;
    private int coach;
    private final long phone;
    private final Date joinDate;

    public Member(int memberId, String lastName, String firstName, char gender, String memberType,
           long phone, Date joinDate) {
        this.memberId = memberId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.memberType = memberType;
        this.phone = phone;
        this.joinDate = joinDate;

    }

    public Member(int memberId, String lastName, String firstName, int handicap, char gender,
           String memberType, long phone, Date joinDate) {
        this(memberId, lastName, firstName, gender, memberType, phone, joinDate);
        this.handicap = handicap;
    }

    public Member(int memberId, String lastName, String firstName, int handicap, char gender,
           String team, String memberType, long phone, Date joinDate) {
        this(memberId, lastName, firstName, handicap, gender, memberType, phone, joinDate);
        this.team = team;
    }

    public Member(int memberId, String lastName, String firstName, int handicap, char gender,
           String memberType, int coach, long phone, Date joinDate) {
        this(memberId, lastName, firstName, handicap, gender, memberType, phone, joinDate);
        this.coach = coach;
    }

    public Member(int memberId, String lastName, String firstName, int handicap, char gender,
           String team, String memberType, int coach, long phone, Date joinDate) {
        this(memberId, lastName, firstName, handicap, gender, memberType, coach, phone, joinDate);
        this.team = team;
    }

    public int getHandicapScore() {
        return handicap;
    }

    public char getGender() {
        return gender;
    }

    public String getTeam() {
        return team;
    }

    public String getMemberType() {
        return memberType;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void display() {
        System.out.println("\nMember ID: " + memberId);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Handicap: " + handicap);
        System.out.println("Gender: " + gender);
        System.out.println("Team: " + team);
        System.out.println("Member Type: " + memberType);
        System.out.println("Coach: " + coach);
        System.out.println("Phone: " + phone);
        System.out.println("Joined on: " + joinDate.getDay() + "-" + joinDate.getMonth() + "-" + joinDate.getYear());
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        Member[] members = new Member[20];
        members[0] = new Member(118, "McKenzie", "Melissa", 30, 'F', "Junior", 153, 963270, new Date(28, "May", 2005));
        members[1] = new Member(138, "Stone", "Michael", 30, 'M', "Senior", 983223, new Date(31, "May", 2009));
        members[2] = new Member(153, "Nolan", "Brenda", 11, 'F', "TeamB", "Senior", 442649, new Date(12, "Aug", 2006));
        members[3] = new Member(176, "Branch", "Helen", 'F', "Social", 589419, new Date(6, "Dec", 2011));
        members[4] = new Member(178, "Beck", "Sarah", 'F', "Social", 226596, new Date(24, "Jan", 2010));
        members[5] = new Member(228, "Burton", "Sandra", 26, 'F', "Junior", 153, 244493, new Date(9, "Jul", 2013));
        members[6] = new Member(235, "Cooper", "William", 14, 'M', "TeamB", "Senior", 153, 722954, new Date(5, "Mar", 2008));
        members[7] = new Member(239, "Spence", "Thomas", 10, 'M', "Senior", 697720, new Date(22, "Jun", 2006));
        members[8] = new Member(258, "Olson", "Barbara", 16, 'F', "Senior", 370186, new Date(29, "Jul", 2013));
        members[9] = new Member(286, "Pollard", "Robert", 19, 'M', "TeamB", "Junior", 235617681, new Date(13, "Aug", 2013));
        members[10] = new Member(290, "Sexton", "Thomas", 26, 'M', "Senior", 235, 268936, new Date(28, "Jul", 2008));
        members[11] = new Member(323, "Wilcox", "Daniel", 3, 'M', "TeamA", "Senior", 665393, new Date(18, "May", 2009));
        members[12] = new Member(331, "Schmidt", "Thomas", 25, 'M', "Senior", 153, 867492, new Date(7, "Apr", 2009));
        members[13] = new Member(332, "Bridges", "Deborah", 12, 'F', "Senior", 235, 279087, new Date(23, "Mar", 2007));
        members[14] = new Member(339, "Young", "Betty", 21, 'F', "TeamB", "Senior", 507813, new Date(17, "Apr", 2009));
        members[15] = new Member(414, "Gilmore", "Jane", 5, 'F', "TeamA", "Junior", 153, 459558, new Date(30, "May", 2007));
        members[16] = new Member(415, "Taylor", "William", 7, 'M', "TeamA", "Senior", 235, 137353, new Date(27, "Nov", 2007));
        members[17] = new Member(461, "Reed", "Robert", 3, 'M', "TeamA", "Senior", 235, 994664, new Date(5, "Aug", 2005));
        members[18] = new Member(469, "Willis", "Carolyn", 29, 'F', "Junior", 688378, new Date(14, "Jan", 2011));
        members[19] = new Member(487, "Kent", "Susan", 'F', "Social", 707217, new Date(7, "Oct", 2010));

        // Display the records where the member’s JoinDate is earlier than 07-Apr-09.
        System.out.println("Members with join date earlier than 07-Apr-09: ");
        Date requiredDate = new Date(7, "April", 2009);
        for (Member member : members) {
            if (member.getJoinDate().isBefore(requiredDate)) member.display();
        }

        // Display the records of all the senior members whose handicap score is less than 12.
        System.out.println("\nSenior members with handicap score less than 12: ");
        for (Member member : members) {
            if (member.getMemberType().equals("Senior") && (member.getHandicapScore() < 12
                    && member.getHandicapScore() > 0))
                member.display();
        }

        // Display the records of all the female senior members who are part of TeamB
        System.out.println("\nFemale senior members in Team B:");
        for (Member member : members) {
            if (member.getMemberType().equals("Senior") &&
                    member.getGender() == 'F' && member.getTeam().equals("TeamB")) {
                member.display();
            }
        }
    }
}