import React, { Component } from "react"
import Header from "../Header"
import Match from "../Match"
import MatchService from "../../service/MatchService"

export default class GroupStagePage1 extends Component {
  constructor(props) {
    super(props)

    this.state = {
      matches: [],
    }
  }

  componentDidMount() {
    MatchService.getMatches().then((res) => {
      this.setState({ matches: res.data })
    })
  }

  render() {
    return (
      <div className='main-container'>
        <Header />
        <div
          className='header-group-table'
          style={{ "background-color": this.props.color }}
        >
          <h5>GROUP {this.props.group}</h5>
        </div>
        <table></table>
        <button className='save-button'>SAVE</button>
        {this.state.matches.length > 0 ? (
          <Match match={this.state.matches[0]} />
        ) : null}

        <div className='vertical-container'></div>
      </div>
    )
  }
}
