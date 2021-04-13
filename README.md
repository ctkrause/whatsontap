# Problem Statement

Anybody looking for a specific type of beer or brewery in the Madison area may have a difficult time finding a singular 
source for this information. Local watering holes tend to have a Facebook page or a poorly maintained website that may or may
not contain the latest information regarding what kind of offerings they have on tap. 

# Project Objectives

- Consolidate all information regarding what's on tap in the Madison area, specifically Atwood and surrounding areas. 
- Allow people to update the current tap list for the bars and restaurants participating.
- Allow people to delete entries that are no longer accurate for each bar or restaurant. 
- Allow users to modify information about existing offerings. 
- Allow users to add new beers as they come on tap at a local bar or restaurant. 

# Project Plan 

- Week 1 
    - Create repository
    - Add all team members to repo 
    - develop problem statement and project objectives 
    - develop the main class for the service 
    - Update journal

- Week 2
    - Setup git branching and test 
    - Verify main branch is deployable 
    - Adding ability to update, delete, modify, and add new entries
    - Setting up db
    - Implement dao
    - Hibernate config 
    - Update journal

- Week 3
    - Testing features of API
    - Ensuring all unit testing is passing
    - Verifying code coverage of unit testing
    - Creating presentation for class 
    - Develop and revise user documentation 
    - Update journal 
  
# Obstacles, findings, learning points
- MySql time zone is a nightmare. (Broke tests, had to reset for each DB, and reset more than once after populating time zone description table)
- DAO (update method) not saving due to transaction commit lines missing. 
- Couldn't get the XMl to return properly (seemed like maybe missing a dependency, but could not resolve)
- Not necessary to test CRUD methods within the testing directory...test DAO only.
- Trying to figure out a way to get different responses for delete because the hibernate methods don't actually return anything.
- Overall structure of the API....understanding how all the moving pieces work together. 
- Trying to map a string to a local date doesn't work, apparently. 
- Merging, branching, and thinking I broke everything when it was actually the time zone issue again. 
- Initial setup, unable to push if you're not actually part of the repo. 
- Merging with main, deleting branches, fear of losing work or breaking things. 