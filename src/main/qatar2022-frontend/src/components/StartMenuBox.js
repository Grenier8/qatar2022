import React from "react"

const StartMenuBox = ({ image, title }) => {
  const myStyle = {
    background: `url(${image})`,
    "background-repeat": "no-repeat",
    "background-size": "cover",
    "background-position": "center",
  }

  return (
    <div className='menu-box-container' style={myStyle}>
      <div className='menu-box-title'>
        <h3>{title}</h3>
      </div>
    </div>
  )
}

export default StartMenuBox
