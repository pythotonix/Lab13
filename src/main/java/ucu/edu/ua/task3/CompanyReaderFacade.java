package ucu.edu.ua.task3;

public class CompanyReaderFacade {
    private PDLReader pdlReader;
    private BrandFetchReader brandFetchReader;

    public CompanyReaderFacade() { //забагато теж не добре анти паттерн God Object
        pdlReader = new PDLReader();
        brandFetchReader = new BrandFetchReader();
    }

    public Company fetch(String companyName) {
        // Company companyPdl = pdlReader.fetch(companyName);
        Company companyBF = brandFetchReader.fetch(companyName);

        return companyBF;
    }

}
