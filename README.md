# Logi(C)raft Plugin

**Logi(C)raft** is a Minecraft plugin designed to teach players the basics of logic gates using holographic visualizations and redstone. The plugin reads schematic files of logic gates and projects them as holograms in the game world. Players can interact with these holograms to learn about each gate's functionality, with explanatory text displayed in the chat.

---

## Features
- **Holographic Logic Gate Visualizations**:  
  Displays gates like AND, OR, NOT, XOR, etc., using schematics projected as holograms.
  
- **Interactive Learning**:  
  Players receive detailed explanations in the chat about how each logic gate works and its role in redstone contraptions.

- **Supports Custom Schematics**:  
  You can add custom schematic files to visualize more complex logic gate setups.

- **Dynamic Text Descriptions**:  
  Text-based descriptions of gates are tailored to enhance understanding, making it easier to learn the fundamentals of redstone logic.

---

## How It Works
1. **Load a Schematic**:  
   Players use the `/hologramgate load <gate>` command to load a logic gate schematic. The schematic is projected as a hologram.

2. **Understand the Gate**:  
   Walk close to the hologram to receive an explanation in the chat about the loaded gate, including input/output behavior and examples of practical applications.

3. **Remove the Hologram**:  
   Use `/hologramgate clear` to remove the hologram from the world.

4. **Use Custom Schematics**:  
   Drop custom `.schematic` files into the plugin’s `schematics/` folder, and they will automatically become available for use.

---

## Commands
| Command                         | Description                                  |
|---------------------------------|----------------------------------------------|
| `/hologramgate load <gate>`     | Loads a hologram of the specified logic gate.|
| `/hologramgate list`            | Lists all available schematics.             |
| `/hologramgate explain <gate>`  | Sends an explanation of the specified gate. |
| `/hologramgate clear`           | Clears the currently loaded hologram.       |

---

## Permissions
| Permission                   | Description                                  |
|------------------------------|----------------------------------------------|
| `Logi(C)raft.use`     | Allows the player to load and clear holograms. |
| `Logi(C)raft.admin`   | Allows managing custom schematics.          |

---

## Installation
1. **Download the Plugin**:
   - Place the `.jar` file in your server’s `plugins` folder.

2. **Restart the Server**:
   - Restart or reload the server to initialize the plugin.

3. **Add Schematics**:
   - Place `.schematic` files into the plugin’s `schematics/` folder.

4. **Verify Commands**:
   - Use `/hologramgate list` to ensure the schematics are loaded.

---

## Supported Gates
- **AND Gate**: Outputs `ON` if both inputs are `ON`.  
- **OR Gate**: Outputs `ON` if at least one input is `ON`.  
- **NOT Gate**: Outputs the opposite of the input (`ON` becomes `OFF`, and vice versa).  
- **XOR Gate**: Outputs `ON` if only one input is `ON`.  
- **NAND Gate**: Outputs `OFF` only if all inputs are `ON`.  
- **NOR Gate**: Outputs `ON` only if all inputs are `OFF`.

Each gate has a hologram and an in-chat explanation to make understanding easier.

---

## Future Updates
- Support for more advanced gates like flip-flops and memory circuits.
- Interactive quizzes to test knowledge of logic gates.
- Multi-language support for text descriptions.

---

## Troubleshooting
- **Hologram Not Showing**:  
  Ensure the `.schematic` file is placed in the correct folder and is properly named.

- **Commands Not Working**:  
  Verify that you have the correct permissions.

- **Lag Issues**:  
  If holograms cause performance issues, reduce the size in `config.yml`.

---

## Credits
Developed by **[Your Name]** with the goal of making redstone logic fun and educational!
