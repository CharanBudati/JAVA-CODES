public class ArtVault {
    public static void main(String[] args) {

        Painting p1 = new Painting("Starry Night",101, "Netherlands", "Oil");
        Sculpture s1 = new Sculpture("The Thinker", 202,"France", "Bronze");

        p1.details();
        s1.details();

        // Access static counter without object
        System.out.println("Total Artifacts Cataloged: " + Artifact.getcount());
    }
}
/*
                <<abstract>>
                -------------------------
                |       Artifact        |
                -------------------------
                - artifactId : String
                - name : String
                - originCountry : String
                -------------------------
                + ENTRY_FEE : double = 500
                - totalArtifacts : int
                -------------------------
                + Artifact(id,name,origin)
                + getArtifactId() : String
                + getName() : String
                + getOriginCountry() : String
                + getTotalArtifacts() : int
                + displayDescription() : void (abstract)
                -------------------------
                         ▲
                         |
          -----------------------------------
          |                                 |
 -------------------               -------------------
 |    Painting     |               |    Sculpture    |
 -------------------               -------------------
 - medium : String                 - material : String
 -------------------               -------------------
 + Painting(...)                   + Sculpture(...)
 + displayDescription()            + displayDescription()
 */