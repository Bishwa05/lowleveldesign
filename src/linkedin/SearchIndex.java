package linkedin;

import java.util.HashMap;
import java.util.List;

public interface Search {
    public List<Member> searchMember(String name);
    public List<Company> searchCompany(String name);
    public List<JobPosting> searchJob(String title);
}

public class SearchIndex implements Search {
    private HashMap<String, List<Member>> memberNames;
    private HashMap<String, List<Company>> companyNames;
    private HashMap<String, List<JobPosting>> jobTitles;

    public List<Member> searchMember(String query) {
        return memberNames.get(query);
    }

    public List<Company> searchCompany(String query) {
        return companyNames.get(query);
    }

    public List<JobPosting> searchJob(String query) {
        return jobTitles.get(query);
    }
}
