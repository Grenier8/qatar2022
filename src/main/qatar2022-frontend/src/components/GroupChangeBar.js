import React from "react"
import { ChangeGroupButton } from "./ChangeGroupButton"

export const GroupChangeBar = ({ changeGroupFunction }) => {
  return (
    <div className='row bg-dark text-light text-center m-0'>
      <div className='col'>
        <ChangeGroupButton
          groupName={"A"}
          color={"purple"}
          changeGroupFunction={changeGroupFunction}
        />
      </div>
      <div className='col'>
        <ChangeGroupButton
          groupName={"B"}
          color={"purple"}
          changeGroupFunction={changeGroupFunction}
        />
      </div>
      <div className='col'>
        <ChangeGroupButton
          groupName={"C"}
          color={"purple"}
          changeGroupFunction={changeGroupFunction}
        />
      </div>
      <div className='col'>
        <ChangeGroupButton
          groupName={"D"}
          color={"purple"}
          changeGroupFunction={changeGroupFunction}
        />
      </div>
      <div className='col'>
        <ChangeGroupButton
          groupName={"E"}
          color={"purple"}
          changeGroupFunction={changeGroupFunction}
        />
      </div>
      <div className='col'>
        <ChangeGroupButton
          groupName={"F"}
          color={"purple"}
          changeGroupFunction={changeGroupFunction}
        />
      </div>
      <div className='col'>
        <ChangeGroupButton
          groupName={"G"}
          color={"purple"}
          changeGroupFunction={changeGroupFunction}
        />
      </div>
      <div className='col'>
        <ChangeGroupButton
          groupName={"H"}
          color={"purple"}
          changeGroupFunction={changeGroupFunction}
        />
      </div>
    </div>
  )
}
