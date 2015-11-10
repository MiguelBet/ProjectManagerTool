package main;

public class SoftwareProject
{
    public String projectName;
    public String projectManager;
    public String hoursWorked;
    public String teamMembers;
    public String currentStatus;
    public String startDate;
    public String expectedDate;
    public String actualDate;

    public SoftwareProject(String projectName, String projectManager, String teamMembers,
                           String currentStatus, String hoursWorked, String startDate,
                           String expectedDate, String actualDate) {
        this.projectName = projectName;
        this.projectManager = projectManager;
        this.teamMembers = teamMembers;
        this.currentStatus = currentStatus;
        this.hoursWorked = hoursWorked;
        this.startDate = startDate;
        this.expectedDate = expectedDate;
        this.actualDate = actualDate;
    }

    void setProjectName(String name)
    {
        this.projectName = name;
    }

    public String getProjectName() {return projectName;}

    public String getProjectManager(){return projectManager;}

    public String getHoursWorked(){return hoursWorked;}

    public String getTeamMembers(){return teamMembers;}

    public String getCurrentStatus(){return currentStatus;}

    public String getStartDate(){return startDate;}

    public String getExpectedDate(){return expectedDate;}

    public String getActualDate(){return actualDate;}
}