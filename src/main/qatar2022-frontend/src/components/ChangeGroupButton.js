import React from "react"

export const ChangeGroupButton = ({
  groupName,
  color,
  changeGroupFunction,
}) => {
  return (
    <div>
      <button
        className='btn btn-dark'
        onClick={() => changeGroupFunction(groupName, color)}
      >
        {groupName}
      </button>
    </div>
  )
}
