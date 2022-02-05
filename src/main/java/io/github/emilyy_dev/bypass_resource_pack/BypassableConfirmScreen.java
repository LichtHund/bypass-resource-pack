//
// Bypass Resource Pack - Fabric mod to reject and bypass forced resource packs
// Copyright (C) 2021  emilyy-dev
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <https://www.gnu.org/licenses/>.
//

package io.github.emilyy_dev.bypass_resource_pack;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;

public interface BypassableConfirmScreen {

  Component BYPASS_TEXT = new TextComponent("Bypass");

  void bypassResourcePack$setBypassAction(Runnable bypass);
}