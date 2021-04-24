package entities;

import java.time.Duration;
import java.util.List;

public interface ISynthesizer {


    Duration synthezise() throws SabanaResearchException;
}
