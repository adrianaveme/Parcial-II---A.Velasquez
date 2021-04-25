package entities;

import java.time.Duration;
import java.util.List;

public interface ISynthesizer {


    List <String> synthezise() throws SabanaResearchException;
}
