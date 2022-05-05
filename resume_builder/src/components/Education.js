import React, { Component } from "react";
import { TextField, Button, Container, Divider, List } from "@material-ui/core";
import { Card, CardHeader, CardContent } from "@material-ui/core";
import NavigateNextIcon from "@material-ui/icons/NavigateNext";
import NavigateBeforeIcon from "@material-ui/icons/NavigateBefore";
import SchoolIcon from "@material-ui/icons/School";
import DateRangeIcon from "@material-ui/icons/DateRange";
import InputAdornment from "@material-ui/core/InputAdornment";
import { Row, Col } from "react-bootstrap";
import { Paper, withStyles, Grid } from "@material-ui/core";
import Header from "./Header";
import { Link } from "react-router-dom";
// import "date-fns";

const styles = (theme) => ({
  margin: {
    margin: theme.spacing.unit * 1.5,
  },
  padding: {
    padding: theme.spacing.unit,
  },
});

class Profile extends Component {
  continue = (e) => {
    e.preventDefault();
    this.props.nextStep();
  };

  back = (e) => {
    e.preventDefault();
    this.props.prevStep();
  };

  render() {
    const { values } = this.props;
    const { classes } = this.props;

    return (
      <div>
        <Header />
        <Paper className={classes.padding}>
          <Card>
            <CardHeader title="Education Details" />
          </Card>
          <CardContent>
            <div className={classes.margin}>
              <Grid container spacing={2} alignItems="center" lg={12}>
                <Grid item md={4} sm={12} xs={12} lg={4}>
                  <TextField
                    margin="dense"
                    variant="outlined"
                    name="college"
                    label="College/Unviersity"
                    style={{ width: "80%" }}
                    required
                    // value={values.college}
                    onChange={this.props.handleChange}
                    InputProps={{
                      endAdornment: (
                        <InputAdornment position="start">
                          <SchoolIcon />
                        </InputAdornment>
                      ),
                    }}
                  />
                </Grid>
                <Grid item md={4} sm={6} xs={12} lg={4}>
                  <TextField
                    margin="dense"
                    variant="outlined"
                    name="fromyear1"
                    label="From Year"
                    type="date"
                    style={{ width: "80%" }}
                    required
                    // value={values.fromyear1}
                    onChange={this.props.handleChange}
                    InputProps={{
                      endAdornment: (
                        <InputAdornment position="start">
                          <DateRangeIcon />
                        </InputAdornment>
                      ),
                    }}
                  />
                </Grid>

                <Grid item md={4} sm={6} xs={12} lg={4}>
                  <TextField
                    margin="dense"
                    variant="outlined"
                    name="toyear1"
                    type="date"
                    label="To Year"
                    style={{ width: "80%" }}
                    required
                    // value={values.toyear1}
                    onChange={this.props.handleChange}
                    InputProps={{
                      endAdornment: (
                        <InputAdornment position="start">
                          <DateRangeIcon />
                        </InputAdornment>
                      ),
                    }}
                  />
                </Grid>

                <Grid item md={4} sm={12} xs={12} lg={4}>
                  <TextField
                    margin="dense"
                    label="Qualification"
                    variant="outlined"
                    style={{ width: "80%" }}
                    name="qualification1"
                    required
                    // value={values.qualification1}
                    onChange={this.props.handleChange}
                  />
                </Grid>

                <Grid item md={8} sm={12} xs={12} lg={8}>
                  <TextField
                    margin="dense"
                    label="Description"
                    variant="outlined"
                    style={{ width: "90%" }}
                    name="description1"
                    required
                    // value={values.description1}
                    onChange={this.props.handleChange}
                  />
                </Grid>
              </Grid>
              <br />
              <Divider />
              <br />
              <Grid container spacing={2} alignItems="center" lg={12}>
                <Grid item md={4} sm={12} xs={12} lg={4}>
                  <TextField
                    margin="dense"
                    variant="outlined"
                    name="school"
                    label="School"
                    style={{ width: "80%" }}
                    required
                    // value={values.school}
                    onChange={this.props.handleChange}
                    InputProps={{
                      endAdornment: (
                        <InputAdornment position="end">
                          <SchoolIcon />
                        </InputAdornment>
                      ),
                    }}
                  />
                </Grid>
                <Grid item md={4} sm={6} xs={12} lg={4}>
                  <TextField
                    margin="dense"
                    variant="outlined"
                    name="fromyear2"
                    label="From Year"
                    type="date"
                    style={{ width: "80%" }}
                    required
                    // value={values.fromyear2}
                    onChange={this.props.handleChange}
                    InputProps={{
                      endAdornment: (
                        <InputAdornment position="start">
                          <DateRangeIcon />
                        </InputAdornment>
                      ),
                    }}
                  />
                </Grid>

                <Grid item md={4} sm={6} xs={12} lg={4}>
                  {/* <CustomDatePicker
                  name={'toyear2'}
                  label={'To Year'}
                  value={values.toyear2}
                /> */}
                  <TextField
                    margin="dense"
                    variant="outlined"
                    name="toyear2"
                    label="To Year"
                    type="date"
                    style={{ width: "80%" }}
                    required
                    // value={values.toyear2}
                    onChange={this.props.handleChange}
                    InputProps={{
                      endAdornment: (
                        <InputAdornment position="start">
                          <DateRangeIcon />
                        </InputAdornment>
                      ),
                    }}
                  />
                </Grid>

                <Grid item md={4} sm={12} xs={12} lg={4}>
                  <TextField
                    margin="dense"
                    label="Qualification"
                    variant="outlined"
                    style={{ width: "80%" }}
                    name="qualification2"
                    required
                    // value={values.qualification2}
                    onChange={this.props.handleChange}
                  />
                </Grid>

                <Grid item md={8} sm={8} xs={8} lg={8}>
                  <TextField
                    margin="dense"
                    label="Description"
                    variant="outlined"
                    style={{ width: "90%" }}
                    name="description2"
                    required
                    // value={values.description2}
                    onChange={this.props.handleChange}
                  />
                </Grid>
              </Grid>
            </div>
          </CardContent>
          <Container className={classes.margin}>
            <Row>
              <Col xs={4} />
              <Col xs={2}>
                <Link to="/profile">
                  <Button
                    style={{ margin: "15px 35px 10px 400px", float: "right" }}
                    variant="contained"
                    color="secondary"
                    //onClick={this.back}
                    startIcon={<NavigateBeforeIcon />}
                  >
                    Back
                  </Button>
                </Link>
              </Col>
              <Col xs={2}>
                <Link to="/projects">
                  <Button
                    style={{ margin: "15px 420px 10px 120px", float: "left" }}
                    variant="contained"
                    color="secondary"
                    // onClick={this.continue}
                    endIcon={<NavigateNextIcon />}
                  >
                    Next
                  </Button>
                </Link>
              </Col>
              <Col xs={4} />
            </Row>
          </Container>
          <p
            style={{ margin: "auto", paddingTop: "50px" }}
            className="text-center text-muted"
          >
            Page 2
          </p>
        </Paper>
      </div>
    );
  }
}

export default withStyles(styles)(Profile);
