package api.db.applications.generated;

import api.db.applications.Applications;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * api.db.applications.Applications}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedApplicationsImpl implements Applications {
    
    private int id;
    private String applicantName;
    private int age;
    private int income;
    private int creditScore;
    private int expenses;
    private String applicantId;
    private Double result;
    private String userId;
    
    protected GeneratedApplicationsImpl() {
        
    }
    
    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public String getApplicantName() {
        return applicantName;
    }
    
    @Override
    public int getAge() {
        return age;
    }
    
    @Override
    public int getIncome() {
        return income;
    }
    
    @Override
    public int getCreditScore() {
        return creditScore;
    }
    
    @Override
    public int getExpenses() {
        return expenses;
    }
    
    @Override
    public String getApplicantId() {
        return applicantId;
    }
    
    @Override
    public OptionalDouble getResult() {
        return OptionalUtil.ofNullable(result);
    }
    
    @Override
    public String getUserId() {
        return userId;
    }
    
    @Override
    public Applications setId(int id) {
        this.id = id;
        return this;
    }
    
    @Override
    public Applications setApplicantName(String applicantName) {
        this.applicantName = applicantName;
        return this;
    }
    
    @Override
    public Applications setAge(int age) {
        this.age = age;
        return this;
    }
    
    @Override
    public Applications setIncome(int income) {
        this.income = income;
        return this;
    }
    
    @Override
    public Applications setCreditScore(int creditScore) {
        this.creditScore = creditScore;
        return this;
    }
    
    @Override
    public Applications setExpenses(int expenses) {
        this.expenses = expenses;
        return this;
    }
    
    @Override
    public Applications setApplicantId(String applicantId) {
        this.applicantId = applicantId;
        return this;
    }
    
    @Override
    public Applications setResult(Double result) {
        this.result = result;
        return this;
    }
    
    @Override
    public Applications setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "            + Objects.toString(getId()));
        sj.add("applicantName = " + Objects.toString(getApplicantName()));
        sj.add("age = "           + Objects.toString(getAge()));
        sj.add("income = "        + Objects.toString(getIncome()));
        sj.add("creditScore = "   + Objects.toString(getCreditScore()));
        sj.add("expenses = "      + Objects.toString(getExpenses()));
        sj.add("applicantId = "   + Objects.toString(getApplicantId()));
        sj.add("result = "        + Objects.toString(OptionalUtil.unwrap(getResult())));
        sj.add("userId = "        + Objects.toString(getUserId()));
        return "ApplicationsImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Applications)) { return false; }
        final Applications thatApplications = (Applications)that;
        if (this.getId() != thatApplications.getId()) {return false; }
        if (!Objects.equals(this.getApplicantName(), thatApplications.getApplicantName())) {return false; }
        if (this.getAge() != thatApplications.getAge()) {return false; }
        if (this.getIncome() != thatApplications.getIncome()) {return false; }
        if (this.getCreditScore() != thatApplications.getCreditScore()) {return false; }
        if (this.getExpenses() != thatApplications.getExpenses()) {return false; }
        if (!Objects.equals(this.getApplicantId(), thatApplications.getApplicantId())) {return false; }
        if (!Objects.equals(this.getResult(), thatApplications.getResult())) {return false; }
      return Objects.equals(this.getUserId(), thatApplications.getUserId());
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(getApplicantName());
        hash = 31 * hash + Integer.hashCode(getAge());
        hash = 31 * hash + Integer.hashCode(getIncome());
        hash = 31 * hash + Integer.hashCode(getCreditScore());
        hash = 31 * hash + Integer.hashCode(getExpenses());
        hash = 31 * hash + Objects.hashCode(getApplicantId());
        hash = 31 * hash + Objects.hashCode(getResult());
        hash = 31 * hash + Objects.hashCode(getUserId());
        return hash;
    }
}