import React, { Component } from "react";
import { getFunName } from "./../helpers";

export class StorePicker extends Component {
  storeNameInput = React.createRef();

  goToStore = event => {
    event.preventDefault();
    const storeName = this.storeNameInput.current.value;
    this.props.history.push(`/store/${storeName}`);
  };

  render() {
    return (
      <form className="store-selector" onSubmit={this.goToStore}>
        <h2>Please Enter a Store</h2>
        <input
          type="text"
          required
          placeholder="Store Name"
          ref={this.storeNameInput}
          defaultValue={getFunName()}
        />
        <button type="submit">Visit Store</button>
      </form>
    );
  }
}

export default StorePicker;
