import Button from 'react-bootstrap/Button';
import OverlayTrigger from 'react-bootstrap/OverlayTrigger';
import Tooltip from 'react-bootstrap/Tooltip';


function Voting() {
    return (
        <div>
            <OverlayTrigger
                placement="bottom"
                overlay={<Tooltip id="button-tooltip-2">Click to upvote</Tooltip>}
            >
                {({ ref, ...triggerHandler }) => (
                    <Button
                        ref={ref}
                        variant="success"
                        {...triggerHandler}
                        className="d-inline-flex align-items-center"
                    >
                        <span className="ms-1">Number</span>
                    </Button>
                )}
            </OverlayTrigger>
            <OverlayTrigger
                placement="bottom"
                overlay={<Tooltip id="button-tooltip-2">Click to downvote</Tooltip>}
            >
                {({ ref, ...triggerHandler }) => (
                    <Button
                        ref={ref}
                        variant="danger"
                        {...triggerHandler}
                        className="d-inline-flex align-items-center"
                    >
                        <span className="ms-1">Number</span>
                    </Button>
                )}
            </OverlayTrigger>
        </div>
    );
}

export default Voting;