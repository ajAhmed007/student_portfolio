package com.example.demo.editProfile;

import java.util.List;

public interface EditProfile {

    /***
     * A summary of the particular
     * activity/education
     * @return summary
     */
    String summary();

    /***
     * Can add clubs the student was
     * involved in.
     * @return a list of clubs
     */
    List<String> clubs();

    /***
     * The student can add any links
     * relevant to their education and
     * experience
     * @return a list of external links
     */
    List<String> externalLinks();
}
