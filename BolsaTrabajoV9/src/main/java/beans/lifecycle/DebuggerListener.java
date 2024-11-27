package beans.lifecycle;

import jakarta.faces.event.PhaseListener;
import jakarta.faces.event.PhaseEvent;
import jakarta.faces.event.PhaseId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DebuggerListener implements PhaseListener {

    private Logger log = LoggerFactory.getLogger(DebuggerListener.class);
    
    @Override
    public void beforePhase(PhaseEvent pe) {
        if(log.isInfoEnabled())
            log.info("Antes de la fase: " + pe.getPhaseId().toString());
    }

    @Override
    public void afterPhase(PhaseEvent pe) {
        if(log.isInfoEnabled())
            log.info("Despues de la fase: " + pe.getPhaseId().toString() );
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
    
}
